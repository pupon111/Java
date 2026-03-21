/*
Compile the Network class. Note that the inner class file is named
Network$Member.class. Use the javap program to spy on the generated code. The
command
javap -private Classname
displays the methods and instance variables. Where do you see the reference to the
enclosing class? (
 */
package org.example.chapter02.task15;

import java.util.ArrayList;

public class Network {
    public class Member { // Member is an inner class of Network
        final private String name;
        final private ArrayList<Member> friends = new ArrayList<>();

        public Member(String name) {
            this.name = name;
        }

        public void deactivate() {
            members.remove(this);
        }

        public void addFriend(Member newFriend) {
            friends.add(newFriend);
        }

        public boolean belongsTo(Network n) {
            return Network.this == n;
        }

        public String toString() {
            var result = new StringBuilder(name);
            result.append(" with friends ");
            for (Member friend : friends) {
                result.append(friend.name);
                result.append(", ");
            }
            return result.subSequence(0, result.length() - 2).toString();
        }
    }

    final private ArrayList<Member> members = new ArrayList<>();

    public Member enroll(String name) {
        var newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }

    public String toString() {
        return members.toString();
    }
}