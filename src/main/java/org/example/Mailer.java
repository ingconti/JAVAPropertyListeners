package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Mailer implements PropertyChangeListener {

    void sendMsg(String msg){
        System.out.println("sending  " + msg);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        //System.out.println("evt  " + evt);
        sendMsg(evt.getPropertyName() +
                " from " +
                evt.getOldValue() +
                " to " +
                evt.getNewValue()
        );
    }
}
