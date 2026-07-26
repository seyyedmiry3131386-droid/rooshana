package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class dy0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ ComponentActivity h;

    public dy0(ComponentActivity componentActivity) {
        this.h = componentActivity;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        w7 w7Var = (w7) this.e.get(str);
        if ((w7Var != null ? w7Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                w7Var.a.g(w7Var.b.T(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(intent, i2));
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r10, defpackage.s7 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy0.b(int, s7, java.lang.Object):void");
    }

    public final y7 c(String str, s7 s7Var, r7 r7Var) {
        js3.p(str, "key");
        e(str);
        this.e.put(str, new w7(r7Var, s7Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            r7Var.g(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) dt2.p(bundle, str, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            r7Var.g(s7Var.T(activityResult.b, activityResult.a));
        }
        return new y7(this, str, s7Var, 1);
    }

    public final y7 d(final String str, g64 g64Var, final s7 s7Var, final r7 r7Var) {
        js3.p(str, "key");
        i64 i64VarD = g64Var.D();
        if (i64VarD.d.compareTo(Lifecycle$State.d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + g64Var + " is attempting to register while current state is " + i64VarD.d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        x7 x7Var = (x7) linkedHashMap.get(str);
        if (x7Var == null) {
            x7Var = new x7(i64VarD);
        }
        b64 b64Var = new b64() { // from class: u7
            @Override // defpackage.b64
            public final void g(g64 g64Var2, Lifecycle$Event lifecycle$Event) {
                dy0 dy0Var = this.a;
                LinkedHashMap linkedHashMap2 = dy0Var.e;
                Lifecycle$Event lifecycle$Event2 = Lifecycle$Event.ON_START;
                String str2 = str;
                if (lifecycle$Event2 != lifecycle$Event) {
                    if (Lifecycle$Event.ON_STOP == lifecycle$Event) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (Lifecycle$Event.ON_DESTROY == lifecycle$Event) {
                            dy0Var.f(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = dy0Var.g;
                LinkedHashMap linkedHashMap3 = dy0Var.f;
                r7 r7Var2 = r7Var;
                s7 s7Var2 = s7Var;
                linkedHashMap2.put(str2, new w7(r7Var2, s7Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    r7Var2.g(obj);
                }
                ActivityResult activityResult = (ActivityResult) dt2.p(bundle, str2, ActivityResult.class);
                if (activityResult != null) {
                    bundle.remove(str2);
                    r7Var2.g(s7Var2.T(activityResult.b, activityResult.a));
                }
            }
        };
        x7Var.a.a(b64Var);
        x7Var.b.add(b64Var);
        linkedHashMap.put(str, x7Var);
        return new y7(this, str, s7Var, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        v7 v7Var = new v7(0);
        for (Number number : new u21(new gq1(v7Var, new a67(10, v7Var)))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        js3.p(str, "key");
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbN = t61.n("Dropping pending result for request ", str, ": ");
            sbN.append(linkedHashMap.get(str));
            t0.m("ActivityResultRegistry", sbN.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            t0.m("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ActivityResult) dt2.p(bundle, str, ActivityResult.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        x7 x7Var = (x7) linkedHashMap2.get(str);
        if (x7Var != null) {
            ArrayList arrayList = x7Var.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                x7Var.a.f((b64) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
