package defpackage;

import androidx.compose.foundation.lazy.layout.e;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class u24 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ u24(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = ((w34) obj).g;
                e eVar = this.b;
                return bt2.t(Integer.valueOf(eVar.a(obj3)), Integer.valueOf(eVar.a(((w34) obj2).g)));
            case 1:
                Object obj4 = ((w34) obj).g;
                e eVar2 = this.b;
                return bt2.t(Integer.valueOf(eVar2.a(obj4)), Integer.valueOf(eVar2.a(((w34) obj2).g)));
            case 2:
                Object obj5 = ((w34) obj2).g;
                e eVar3 = this.b;
                return bt2.t(Integer.valueOf(eVar3.a(obj5)), Integer.valueOf(eVar3.a(((w34) obj).g)));
            default:
                Object obj6 = ((w34) obj2).g;
                e eVar4 = this.b;
                return bt2.t(Integer.valueOf(eVar4.a(obj6)), Integer.valueOf(eVar4.a(((w34) obj).g)));
        }
    }
}
