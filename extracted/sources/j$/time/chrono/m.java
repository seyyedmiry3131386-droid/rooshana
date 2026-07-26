package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends Comparable {
    boolean equals(Object obj);

    String h();

    int hashCode();

    String n();

    n q(int i);

    b t(TemporalAccessor temporalAccessor);

    String toString();

    e u(LocalDateTime localDateTime);
}
