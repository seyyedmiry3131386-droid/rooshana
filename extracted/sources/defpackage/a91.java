package defpackage;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a91 implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ b91 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a91(b91 b91Var, Object obj, int i) {
        this.a = i;
        this.b = b91Var;
        this.c = obj;
    }

    private final void a() {
        b91 b91Var = this.b;
        c91 c91Var = (c91) this.c;
        CustomTabsService customTabsService = b91Var.n;
        customTabsService.getClass();
        try {
            synchronized (customTabsService.a) {
                try {
                    gf3 gf3Var = c91Var.a;
                    IBinder iBinder = gf3Var == null ? null : ((ef3) gf3Var).n;
                    if (iBinder == null) {
                        return;
                    }
                    iBinder.unlinkToDeath((IBinder.DeathRecipient) customTabsService.a.get(iBinder), 0);
                    customTabsService.a.remove(iBinder);
                } finally {
                }
            }
        } catch (NoSuchElementException unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                b91 b91Var = this.b;
                e10 e10Var = (e10) this.c;
                CustomTabsService customTabsService = b91Var.n;
                customTabsService.getClass();
                try {
                    synchronized (customTabsService.a) {
                        try {
                            df3 df3Var = e10Var.a;
                            IBinder iBinder = df3Var == null ? null : ((cf3) df3Var).n;
                            if (iBinder == null) {
                                return;
                            }
                            iBinder.unlinkToDeath((IBinder.DeathRecipient) customTabsService.a.get(iBinder), 0);
                            customTabsService.a.remove(iBinder);
                            return;
                        } finally {
                        }
                    }
                } catch (NoSuchElementException unused) {
                    return;
                }
        }
    }
}
