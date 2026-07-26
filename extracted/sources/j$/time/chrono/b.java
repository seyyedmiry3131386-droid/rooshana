package j$.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    /* JADX INFO: renamed from: A */
    int compareTo(b bVar);

    m a();

    @Override // j$.time.temporal.m
    b c(long j, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.m
    b d(long j, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.TemporalAccessor
    boolean e(j$.time.temporal.p pVar);

    int hashCode();

    String toString();

    long x();

    e y(j$.time.j jVar);
}
