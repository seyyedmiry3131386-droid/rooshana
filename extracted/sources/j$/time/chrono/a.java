package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements m {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return h().compareTo(((m) obj).h());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m i(m mVar, String str) {
        String strN;
        m mVar2 = (m) a.putIfAbsent(str, mVar);
        if (mVar2 == null && (strN = mVar.n()) != null) {
            b.putIfAbsent(strN, mVar);
        }
        return mVar2;
    }

    @Override // j$.time.chrono.m
    public e u(LocalDateTime localDateTime) {
        try {
            return t(localDateTime).y(j$.time.j.E(localDateTime));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && h().compareTo(((a) obj).h()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ h().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return h();
    }
}
