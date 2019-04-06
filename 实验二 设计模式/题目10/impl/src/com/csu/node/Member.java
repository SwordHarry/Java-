package com.csu.node;

public class Member extends CommunicationNode {

   public void broadcast() {
      System.out.println("收到！");
   }

   public void addMember(CommunicationNode member) {
      System.out.println("对不起，不支持该方法！");
   }

   public void removeMember(CommunicationNode member) {
      System.out.println("对不起，不支持该方法！");
   }

   public CommunicationNode getMember(int index) {
      System.out.println("对不起，不支持该方法！");
      return null;
   }

}