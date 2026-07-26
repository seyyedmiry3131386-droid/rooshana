package j$.util.stream;

import java.util.stream.Collector;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h {
    public final /* synthetic */ Collector a;

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.a;
        if (obj instanceof h) {
            obj = ((h) obj).a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
