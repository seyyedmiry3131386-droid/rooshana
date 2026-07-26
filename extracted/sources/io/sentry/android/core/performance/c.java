package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparable {
    public final h a = new h();
    public final h b = new h();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        int iCompare = Long.compare(this.a.c, cVar.a.c);
        return iCompare == 0 ? Long.compare(this.b.c, cVar.b.c) : iCompare;
    }
}
