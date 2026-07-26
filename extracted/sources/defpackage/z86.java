package defpackage;

import android.os.CountDownTimer;
import ir.mservices.market.login.ui.PinViewModel;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class z86 extends CountDownTimer {
    public final /* synthetic */ PinViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z86(PinViewModel pinViewModel, long j) {
        super(j, 1000L);
        this.a = pinViewModel;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        l lVar = this.a.s;
        Boolean bool = Boolean.TRUE;
        lVar.getClass();
        lVar.p(null, bool);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        long j2 = 60000;
        l lVar = this.a.q;
        String str = String.format(Locale.US, "(%02d:%02d)", Arrays.copyOf(new Object[]{Integer.valueOf((int) (j / j2)), Integer.valueOf((int) ((j % j2) / ((long) 1000)))}, 2));
        lVar.getClass();
        lVar.p(null, str);
    }
}
