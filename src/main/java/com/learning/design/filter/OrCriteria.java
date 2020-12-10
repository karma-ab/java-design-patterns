package com.learning.design.filter;

import java.util.List;

public class OrCriteria implements Criteria{

    Criteria criteria1;
    Criteria criteria2;

    public OrCriteria(Criteria criteria1,Criteria criteria2){
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPerson = criteria1.meetCriteria(persons);
        List<Person> secondCriteriaPerson = criteria2.meetCriteria(persons);
        firstCriteriaPerson.addAll(secondCriteriaPerson);
        return firstCriteriaPerson;
    }
}
