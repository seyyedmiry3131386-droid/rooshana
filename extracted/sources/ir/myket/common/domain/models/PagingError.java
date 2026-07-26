package ir.myket.common.domain.models;

/* JADX INFO: loaded from: classes3.dex */
public final class PagingError extends Throwable {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PagingError);
    }

    public final int hashCode() {
        throw null;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "PagingError(errorDto=null)";
    }
}
