package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ah4 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public ah4(int i, int i2, int i3, dc6 dc6Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = dc6Var;
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((MapBuilder) this.d).h != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.a;
            MapBuilder mapBuilder = (MapBuilder) this.d;
            if (i >= mapBuilder.f || mapBuilder.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateE = q69.e(view);
            h3 h3Var = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof g3 ? ((g3) accessibilityDelegateE).a : new h3(accessibilityDelegateE);
            if (h3Var == null) {
                h3Var = new h3();
            }
            q69.q(view, h3Var);
            view.setTag(this.a, obj);
            q69.j(this.c, view);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((MapBuilder) this.d).f;
    }

    public void remove() {
        MapBuilder mapBuilder = (MapBuilder) this.d;
        b();
        if (this.b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        mapBuilder.c();
        mapBuilder.m(this.b);
        this.b = -1;
        this.c = mapBuilder.h;
    }

    public ah4() {
        if (bq8.a == null) {
            bq8.a = new bq8();
        }
    }
}
