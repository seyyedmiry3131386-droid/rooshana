package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class rd7 implements q79 {
    public final Application a;
    public final p79 b;
    public final Bundle c;
    public final i64 d;
    public final bn6 e;

    public rd7() {
        this.b = new p79(null);
    }

    @Override // defpackage.q79
    public final k79 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.q79
    public final k79 b(Class cls, ta5 ta5Var) {
        LinkedHashMap linkedHashMap = ta5Var.a;
        String str = (String) linkedHashMap.get(r79.c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(rq4.b) == null || linkedHashMap.get(rq4.c) == null) {
            if (this.d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(p79.e);
        boolean zIsAssignableFrom = vi.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? sd7.a(cls, sd7.b) : sd7.a(cls, sd7.a);
        return constructorA == null ? this.b.b(cls, ta5Var) : (!zIsAssignableFrom || application == null) ? sd7.b(cls, constructorA, rq4.t(ta5Var)) : sd7.b(cls, constructorA, application, rq4.t(ta5Var));
    }

    @Override // defpackage.q79
    public final k79 c(ps0 ps0Var, ta5 ta5Var) {
        return b(yh0.u(ps0Var), ta5Var);
    }

    public final k79 d(String str, Class cls) {
        jd7 jd7Var;
        i64 i64Var = this.d;
        if (i64Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = vi.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? sd7.a(cls, sd7.b) : sd7.a(cls, sd7.a);
        int i = 3;
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (xl2.b == null) {
                xl2.b = new xl2(3);
            }
            js3.m(xl2.b);
            return m91.k(cls);
        }
        bn6 bn6Var = this.e;
        js3.m(bn6Var);
        Bundle bundleO = bn6Var.o(str);
        if (bundleO == null) {
            bundleO = this.c;
        }
        if (bundleO == null) {
            jd7Var = new jd7();
        } else {
            ClassLoader classLoader = jd7.class.getClassLoader();
            js3.m(classLoader);
            bundleO.setClassLoader(classLoader);
            MapBuilder mapBuilder = new MapBuilder(bundleO.size());
            for (String str2 : bundleO.keySet()) {
                js3.m(str2);
                mapBuilder.put(str2, bundleO.get(str2));
            }
            jd7Var = new jd7(mapBuilder.b());
        }
        kd7 kd7Var = new kd7(str, jd7Var);
        kd7Var.b(bn6Var, i64Var);
        Lifecycle$State lifecycle$State = i64Var.d;
        if (lifecycle$State == Lifecycle$State.b || lifecycle$State.compareTo(Lifecycle$State.d) >= 0) {
            bn6Var.v();
        } else {
            i64Var.a(new vf1(i64Var, bn6Var, i));
        }
        k79 k79VarB = (!zIsAssignableFrom || application == null) ? sd7.b(cls, constructorA, jd7Var) : sd7.b(cls, constructorA, application, jd7Var);
        k79VarB.a(kd7Var, "androidx.lifecycle.savedstate.vm.tag");
        return k79VarB;
    }

    public rd7(Application application, qd7 qd7Var, Bundle bundle) {
        p79 p79Var;
        this.e = qd7Var.o();
        this.d = qd7Var.D();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (p79.d == null) {
                p79.d = new p79(application);
            }
            p79Var = p79.d;
            js3.m(p79Var);
        } else {
            p79Var = new p79(null);
        }
        this.b = p79Var;
    }
}
