package org.junit.experimental.theories.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ParameterizedAssertionError extends AssertionError {
    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedAssertionError) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }
}
