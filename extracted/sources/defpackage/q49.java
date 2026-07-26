package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class q49 {
    public final wv a;
    public final wv b;
    public final wv c;

    public q49(wv wvVar, wv wvVar2, wv wvVar3) {
        this.a = wvVar;
        this.b = wvVar2;
        this.c = wvVar3;
    }

    public abstract r49 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        wv wvVar = this.c;
        Class cls2 = (Class) wvVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(rm7.q(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        wvVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        wv wvVar = this.a;
        Method method = (Method) wvVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, q49.class.getClassLoader()).getDeclaredMethod("read", q49.class);
        wvVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        wv wvVar = this.b;
        Method method = (Method) wvVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, q49.class);
        wvVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((r49) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((r49) this).e.readParcelable(r49.class.getClassLoader());
    }

    public final s49 h() {
        String string = ((r49) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (s49) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((r49) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((r49) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(s49 s49Var) {
        if (s49Var == null) {
            ((r49) this).e.writeString(null);
            return;
        }
        try {
            ((r49) this).e.writeString(b(s49Var.getClass()).getName());
            r49 r49VarA = a();
            try {
                d(s49Var.getClass()).invoke(null, s49Var, r49VarA);
                Parcel parcel = r49VarA.e;
                int i = r49VarA.i;
                if (i >= 0) {
                    int i2 = r49VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(s49Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
