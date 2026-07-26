package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uu0 extends qt8 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public uu0(ci4 ci4Var, qq5 qq5Var) {
        this.b = ci4Var;
        this.c = qq5Var;
    }

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) throws IOException {
        switch (this.a) {
            case 0:
                if (mw3Var.R() == JsonToken.i) {
                    mw3Var.J();
                    return null;
                }
                Collection collection = (Collection) ((qq5) this.c).a();
                mw3Var.c1();
                while (mw3Var.hasNext()) {
                    collection.add(((ci4) this.b).c.b(mw3Var));
                }
                mw3Var.W0();
                return collection;
            default:
                Class cls = (Class) this.b;
                Object objB = ((lu8) this.c).c.b(mw3Var);
                if (objB == null || cls.isInstance(objB)) {
                    return objB;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + mw3Var.k(true));
        }
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    uw3Var.c1();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((ci4) this.b).c(uw3Var, it.next());
                    }
                    uw3Var.W0();
                } else {
                    uw3Var.u();
                }
                break;
            default:
                ((lu8) this.c).c.c(uw3Var, obj);
                break;
        }
    }

    public uu0(lu8 lu8Var, Class cls) {
        this.c = lu8Var;
        this.b = cls;
    }
}
