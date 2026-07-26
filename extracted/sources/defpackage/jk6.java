package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jk6 extends g38 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public jk6(long j, int i, long j2) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, h26 h26Var) {
        long jX = h26Var.x();
        if ((128 & jX) != 0) {
            return 8589934591L & ((((jX & 1) << 32) | h26Var.z()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.g38
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return bl4.s(this.c, " }", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return bl4.s(this.c, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.b);
                sb3.append(", playbackPositionUs= ");
                return bl4.s(this.c, " }", sb3);
        }
    }

    public jk6(List list, long j, long j2) {
        this.a = 1;
        this.b = j;
        this.c = j2;
        DesugarCollections.unmodifiableList(list);
    }
}
