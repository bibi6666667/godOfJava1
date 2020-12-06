package com.godOfJava1.c10inheritance;

public class InheritanceCasting {
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        //inheritance.objectCast();
        //inheritance.objectCast2();
        inheritance.objectCastArray();
    }

    public void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child; // 자식 클래스 -> 부모 클래스로 형변환(O)
       //  ChildCasting child2 = (ChildCasting) parent; // 부모 클래스 -> 자식 클래스로 형변환(X)
    }

    public void objectCast2() {
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child; // 자식 클래스 -> 부모 클래스로 형변환(O)
        ChildCasting child2 = (ChildCasting) parent2; // parent2에는 실제로는 자식클래스child가 들어 있으므로 컴파일, 실행이 된다.
    }

    public void objectCastArray() {
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
        objectTypeCheck(parentArray);
        objectTypeCheck2(parentArray);
    }

    public void objectTypeCheck(ParentCasting[] parentArray) {
        for(ParentCasting tempParent : parentArray) {
            if (tempParent instanceof ChildCasting) { // instanceof : 객체의 타입을 구분함. 맞으면true 틀리면false
                System.out.println("ChildCasting");// 자식 객체로 확인됐을 때만 아래 코드 실행
                ChildCasting tempChild = (ChildCasting) tempParent;
                tempChild.printAge();
            } else if ( tempParent instanceof ParentCasting) {
                System.out.println("ParentCasting");
            }
        }
    }

    public void objectTypeCheck2(ParentCasting[] parentArray) {
        for (ParentCasting tempParent : parentArray) {
            if(tempParent instanceof ParentCasting) {
                System.out.println("ParentCasting");
            } else if (tempParent instanceof ChildCasting) {
                System.out.println("ChildCasting");
                ChildCasting tempChild = (ChildCasting)tempParent;
                tempChild.printAge();
            }
        }
    }
}
