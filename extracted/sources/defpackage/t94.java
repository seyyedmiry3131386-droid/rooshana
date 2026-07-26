package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class t94 {
    public final td8 a;
    public final wd8 b;
    public final r94 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public t94(Looper looper, td8 td8Var, r94 r94Var) {
        this(new CopyOnWriteArraySet(), looper, td8Var, r94Var, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new s94(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        wd8 wd8Var = this.b;
        if (!wd8Var.a.hasMessages(1)) {
            wd8Var.getClass();
            vd8 vd8VarB = wd8.b();
            Message messageObtainMessage = wd8Var.a.obtainMessage(1);
            vd8VarB.a = messageObtainMessage;
            Handler handler = wd8Var.a;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            vd8VarB.a();
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, q94 q94Var) {
        g();
        this.f.add(new cy0(new CopyOnWriteArraySet(this.d), i, q94Var, 4));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        for (s94 s94Var : this.d) {
            r94 r94Var = this.c;
            s94Var.d = true;
            if (s94Var.c) {
                s94Var.c = false;
                r94Var.d(s94Var.a, s94Var.b.h());
            }
        }
        this.d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet<s94> copyOnWriteArraySet = this.d;
        for (s94 s94Var : copyOnWriteArraySet) {
            if (s94Var.a.equals(obj)) {
                s94Var.d = true;
                if (s94Var.c) {
                    s94Var.c = false;
                    this.c.d(s94Var.a, s94Var.b.h());
                }
                copyOnWriteArraySet.remove(s94Var);
            }
        }
    }

    public final void f(int i, q94 q94Var) {
        c(i, q94Var);
        b();
    }

    public final void g() {
        if (this.i) {
            vy2.s(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public t94(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, td8 td8Var, r94 r94Var, boolean z) {
        this.a = td8Var;
        this.d = copyOnWriteArraySet;
        this.c = r94Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = td8Var.a(looper, new p94(0, this));
        this.i = z;
    }
}
