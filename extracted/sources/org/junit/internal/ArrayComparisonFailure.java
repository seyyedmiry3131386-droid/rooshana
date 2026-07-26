package org.junit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class ArrayComparisonFailure extends AssertionError {
    private static final long serialVersionUID = 1;

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return super.getCause() == null ? null : super.getCause();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        new StringBuilder().append("arrays first differed at element ");
        throw null;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        getMessage();
        throw null;
    }
}
