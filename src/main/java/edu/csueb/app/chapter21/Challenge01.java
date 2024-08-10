package edu.csueb.app.chapter21;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Challenge01 {

    public Set<String> config() {
        Set<String> set02 = new LinkedHashSet<>();

        set02.add("George");
        set02.add("Katy");
        set02.add("Kevin");
        set02.add("Michelle");
        set02.add("Ryan");

        return set02;
    }
    public Set<String> getUnion(Set<String> set) {

        Set<String> u = config();

        set.addAll(u);

        return set;
    }

    public Set<String> getDifference(Set<String> s) {
        Set<String> d = config();

        s.removeAll(d);

        return s;
    }

    public Set<String> getIntersection(Set<String> set) {
        Set<String> i = config();

        set.retainAll(i);

        return i;
    }
}
/*
 (Perform set operations on hash sets)
 1. Create two linked hash sets:

 { "George", "Jim", "John", "Blake", "Kevin", "Michael" }
 { "George", "Katy", "Kevin", "Michelle", "Ryan" }

 2. Find their union, difference, and intersection.

 (You can clone the sets to preserve the original sets from being changed by these set methods.)
 */