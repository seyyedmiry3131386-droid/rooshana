package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y7 extends t7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ s7 d;

    public /* synthetic */ y7(dy0 dy0Var, String str, s7 s7Var, int i) {
        this.a = i;
        this.b = dy0Var;
        this.c = str;
        this.d = s7Var;
    }

    @Override // defpackage.t7
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                dy0 dy0Var = this.b;
                ArrayList arrayList = dy0Var.d;
                LinkedHashMap linkedHashMap = dy0Var.b;
                String str = this.c;
                Object obj2 = linkedHashMap.get(str);
                s7 s7Var = this.d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + s7Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    dy0Var.b(iIntValue, s7Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                dy0 dy0Var2 = this.b;
                ArrayList arrayList2 = dy0Var2.d;
                LinkedHashMap linkedHashMap2 = dy0Var2.b;
                String str2 = this.c;
                Object obj3 = linkedHashMap2.get(str2);
                s7 s7Var2 = this.d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + s7Var2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    dy0Var2.b(iIntValue2, s7Var2, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str2);
                    throw e2;
                }
        }
    }

    @Override // defpackage.t7
    public final void b() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            default:
                this.b.f(this.c);
                break;
        }
    }
}
