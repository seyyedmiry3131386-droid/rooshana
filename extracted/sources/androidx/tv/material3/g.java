package androidx.tv.material3;

import defpackage.dp2;
import defpackage.is3;
import defpackage.j52;
import defpackage.j82;
import defpackage.k22;
import defpackage.kr8;
import defpackage.nz1;
import defpackage.rq3;
import defpackage.uy7;
import defpackage.wo0;
import defpackage.y97;
import defpackage.zd7;
import defpackage.zq3;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final float a = 24;

    static {
        int i = nz1.a;
        long j = 1;
        long j2 = (j & 4294967295L) | (j << 32);
        androidx.compose.animation.j.d(null, 3).a(new k22(new kr8((j82) null, new uy7(new dp2() { // from class: androidx.tv.material3.NavigationDrawerItemDefaults$ContentAnimationEnter$1
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return new rq3(is3.a(-((int) (((zq3) obj).a >> 32)), 0));
            }
        }, y97.c0(0.0f, 400.0f, new rq3(j2), 1)), (wo0) null, (zd7) null, (LinkedHashMap) null, 125)));
        androidx.compose.animation.j.e(null, 3).a(new j52(new kr8((j82) null, new uy7(new dp2() { // from class: androidx.tv.material3.NavigationDrawerItemDefaults$ContentAnimationExit$1
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                long j3 = ((zq3) obj).a;
                return new rq3(is3.a(0, 0));
            }
        }, y97.c0(0.0f, 400.0f, new rq3(j2), 1)), (wo0) null, (zd7) null, (LinkedHashMap) null, 125)));
    }
}
