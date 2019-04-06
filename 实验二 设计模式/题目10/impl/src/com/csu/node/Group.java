package com.csu.node;

import java.util.LinkedList;

public class Group extends CommunicationNode {

   private LinkedList<CommunicationNode> communicationNodes = new LinkedList<>();

   public void broadcast() {
      for (CommunicationNode communicationNode: communicationNodes) {
         communicationNode.broadcast();
      }
   }

   public void addMember(CommunicationNode member) {
     communicationNodes.add(member);
   }

   public void removeMember(CommunicationNode member) {
      communicationNodes.remove(member);
   }

   public CommunicationNode getMember(int index) {
      return communicationNodes.get(index);
   }

}