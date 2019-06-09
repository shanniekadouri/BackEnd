package com.bethashanti.beckend;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Announcement {

    private final long systemId;
    private Date date;
    private Instructor composingInstructor;
    private EnumTypes.Topic topic;
    private List<Child> releventChildren;
    private List<Instructor> releventInstructors;
    private Map<Instructor, String> managmentComments;

    public Announcement(long systemId, String date, Instructor composingInstructor, String topic, List<Child> releventChildren, List<Instructor> releventInstructors) throws ParseException {
        this.systemId = systemId;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.composingInstructor = composingInstructor;
        this.topic = EnumTypes.Topic.valueOf(topic);
        this.releventChildren = releventChildren;
        this.releventInstructors = releventInstructors;
        this.managmentComments = new HashMap<Instructor, String>();
    }

    public Date getDate() {
        return this.date;
    }

    public Instructor getComposingInstructor() {
        return this.composingInstructor;
    }

    public EnumTypes.Topic getTopic() {
        return this.topic;
    }

    public List<Child> getReleventChildren() {
        return releventChildren;
    }

    public List<Instructor> getReleventInstructors() {
        return releventInstructors;
    }

    public Map<Instructor, String> getManagmentComments() {
        return this.managmentComments;
    }

    public void setManagmentComments(Instructor instructor, String comment) {
        this.managmentComments.put(instructor, comment);
    }
}
