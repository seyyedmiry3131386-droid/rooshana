package defpackage;

import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g03 extends h03 {
    public final String l;
    public final ImmutableList m;

    public g03(long j, String str, String str2, long j2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ImmutableList.q());
    }

    public g03(String str, g03 g03Var, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, g03Var, j, i, j2, drmInitData, str3, str4, j3, j4, z);
        this.l = str2;
        this.m = ImmutableList.n(list);
    }
}
