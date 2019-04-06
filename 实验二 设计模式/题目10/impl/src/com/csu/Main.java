package com.csu;

import com.csu.node.CommunicationNode;
import com.csu.node.Group;
import com.csu.node.Member;

public class Main {

    public static void main(String[] args) {

        CommunicationNode group = new Group();
        CommunicationNode[] members = new CommunicationNode[5];
        CommunicationNode smallGroup = new Group();
        for (int i = 0; i < members.length; i++) {
            members[i] = new Member();
            group.addMember(members[i]);
        }
        for (CommunicationNode member : members) {
            smallGroup.addMember(member);
        }

        group.addMember(smallGroup);
        group.broadcast();

    }
}
