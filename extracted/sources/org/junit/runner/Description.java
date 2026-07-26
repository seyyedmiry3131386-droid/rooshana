package org.junit.runner;

import java.io.Serializable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class Description implements Serializable {
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;

    static {
        Pattern.compile("([\\s\\S]*)\\((.*)\\)");
        new Description("No Tests");
        new Description("Test mechanism");
    }

    public Description(String str) {
        new ConcurrentLinkedQueue();
        if (str.length() == 0) {
            throw new IllegalArgumentException("The display name must not be empty.");
        }
        this.a = str;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Description) {
            return this.b.equals(((Description) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
