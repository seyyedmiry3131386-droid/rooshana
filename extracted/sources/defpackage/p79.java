package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class p79 extends xl2 {
    public static p79 d;
    public static final js8 e = new js8();
    public final Application c;

    public p79(Application application) {
        super(3);
        this.c = application;
    }

    @Override // defpackage.xl2, defpackage.q79
    public final k79 a(Class cls) {
        Application application = this.c;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.xl2, defpackage.q79
    public final k79 b(Class cls, ta5 ta5Var) {
        if (this.c != null) {
            return a(cls);
        }
        Application application = (Application) ta5Var.a.get(e);
        if (application != null) {
            return d(cls, application);
        }
        if (vi.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return m91.k(cls);
    }

    public final k79 d(Class cls, Application application) {
        if (!vi.class.isAssignableFrom(cls)) {
            return m91.k(cls);
        }
        try {
            k79 k79Var = (k79) cls.getConstructor(Application.class).newInstance(application);
            js3.m(k79Var);
            return k79Var;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(bl4.v("Cannot create an instance of ", cls), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(bl4.v("Cannot create an instance of ", cls), e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(bl4.v("Cannot create an instance of ", cls), e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(bl4.v("Cannot create an instance of ", cls), e5);
        }
    }
}
