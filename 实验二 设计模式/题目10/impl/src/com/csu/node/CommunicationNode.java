package com.csu.node;

import java.util.LinkedList;

public abstract class CommunicationNode {

   public abstract void broadcast();

   public abstract void addMember(CommunicationNode member);

   public abstract void removeMember(CommunicationNode member);

   public abstract CommunicationNode getMember(int index);

}