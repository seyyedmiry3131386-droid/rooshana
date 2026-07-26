package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: classes.dex */
public final class q81 extends ContentObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q81(int i, Object obj) {
        super(null);
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                tb8 tb8Var = (tb8) this.b;
                if (!tb8Var.b || (cursor = tb8Var.c) == null || cursor.isClosed()) {
                    return;
                }
                tb8Var.a = tb8Var.c.requery();
                return;
            case 1:
            default:
                super.onChange(z);
                return;
            case 2:
                ((AtomicBoolean) ((go8) this.b).a).set(true);
                return;
            case 3:
                fr9 fr9Var = (fr9) this.b;
                synchronized (fr9Var.f) {
                    fr9Var.g = null;
                    fr9Var.c.run();
                    break;
                }
                synchronized (fr9Var) {
                    try {
                        Iterator it = fr9Var.h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                ((AtomicBoolean) ((ry0) this.b).d).set(true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(go8 go8Var) {
        super(null);
        this.a = 2;
        Objects.requireNonNull(go8Var);
        this.b = go8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(a aVar, Handler handler) {
        super(handler);
        this.a = 1;
        this.b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q81(tb8 tb8Var) {
        super(new Handler());
        this.a = 0;
        this.b = tb8Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 1:
                ((a) this.b).o(tx8.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}
