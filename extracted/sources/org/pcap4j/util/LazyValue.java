package org.pcap4j.util;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class LazyValue<T1> implements Serializable {
    private static final long serialVersionUID = 1379102837076225509L;
    private final transient BuildValueCommand<T1> command;
    private final transient Object thisLock = new Object();
    private volatile T1 value = null;

    public interface BuildValueCommand<T2> {
        T2 buildValue();
    }

    public LazyValue(BuildValueCommand<T1> buildValueCommand) {
        this.command = buildValueCommand;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        getValue();
        if (this.value == null) {
            throw new AssertionError();
        }
        objectOutputStream.defaultWriteObject();
    }

    public T1 getValue() {
        if (this.value == null) {
            synchronized (this.thisLock) {
                try {
                    if (this.value == null) {
                        this.value = this.command.buildValue();
                    }
                } finally {
                }
            }
        }
        return this.value;
    }
}
