package defpackage;

import com.microsoft.clarity.g.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;

/* JADX INFO: loaded from: classes3.dex */
public final class gq1 implements ho7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ gq1(ho7 ho7Var, Object obj, int i) {
        this.a = i;
        this.b = ho7Var;
        this.c = obj;
    }

    @Override // defpackage.ho7
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new fq1(new oc2((pc2) this.b), (v27) this.c);
            case 1:
                return new fq1(this);
            case 2:
                return new n66(this);
            case 3:
                ArrayList arrayListX = mo7.x((gq1) this.b);
                yu0.Y(arrayListX, (r) this.c);
                return arrayListX.iterator();
            default:
                return new oc2(this);
        }
    }

    public gq1(File file, FileWalkDirection fileWalkDirection) {
        this.a = 1;
        js3.p(file, "start");
        this.b = file;
        this.c = fileWalkDirection;
    }

    public gq1(bp2 bp2Var, dp2 dp2Var) {
        this.a = 2;
        js3.p(dp2Var, "getNextValue");
        this.b = bp2Var;
        this.c = dp2Var;
    }
}
