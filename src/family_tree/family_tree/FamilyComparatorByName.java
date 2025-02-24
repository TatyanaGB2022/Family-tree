package family_tree.family_tree;

import human.Human;

import java.util.Comparator;

public class FamilyComparatorByName<T extends TreeNode<T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
