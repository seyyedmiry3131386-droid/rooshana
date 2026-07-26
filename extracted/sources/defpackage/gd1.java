package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.common.collect.ImmutableList;
import ir.mservices.market.app.common.recycler.AppNestedData;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd1 implements q94, n31, cg1, yp2, ly0, og5, h32 {
    public final /* synthetic */ int a;

    public /* synthetic */ gd1(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ Path e(Object obj) {
        return (Path) obj;
    }

    public Constructor a() {
        switch (this.a) {
            case 4:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(v72.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(v72.class).getConstructor(null);
        }
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        ((sw1) obj).a();
    }

    @Override // defpackage.yp2
    public Object apply(Object obj) {
        zo8 zo8Var = (zo8) obj;
        zo8Var.getClass();
        Bundle bundle = new Bundle();
        String str = zo8.e;
        ImmutableList immutableList = zo8Var.b;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(immutableList.size());
        p0 p0VarListIterator = immutableList.listIterator(0);
        while (p0VarListIterator.hasNext()) {
            arrayList.add(((yo8) p0VarListIterator.next()).d());
        }
        bundle.putParcelableArrayList(str, arrayList);
        return bundle;
    }

    @Override // defpackage.cg1
    public void b(jq4 jq4Var) {
    }

    @Override // defpackage.ly0
    public Object h(o77 o77Var) {
        Set setE = o77Var.E(q20.class);
        pt2 pt2Var = pt2.c;
        if (pt2Var == null) {
            synchronized (pt2.class) {
                try {
                    pt2Var = pt2.c;
                    if (pt2Var == null) {
                        pt2Var = new pt2(0);
                        pt2.c = pt2Var;
                    }
                } finally {
                }
            }
        }
        return new ei1(setE, pt2Var);
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        ce ceVar = (ce) obj;
        switch (this.a) {
            case 0:
                ceVar.getClass();
                break;
            case 1:
                ceVar.getClass();
                break;
            default:
                ceVar.getClass();
                break;
        }
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
    }

    @Override // defpackage.og5
    public void m(View view, qg5 qg5Var, Object obj) {
        js3.p(view, "<unused var>");
        js3.p((h95) qg5Var, "<unused var>");
        js3.p((AppNestedData) obj, "<unused var>");
    }

    public /* synthetic */ gd1(be beVar) {
        this.a = 2;
    }

    public /* synthetic */ gd1(be beVar, Object obj, int i) {
        this.a = i;
    }
}
