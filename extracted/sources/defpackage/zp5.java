package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.OverScroller;
import ir.mservices.market.views.NumberPickerView;

/* JADX INFO: loaded from: classes3.dex */
public final class zp5 extends Handler {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ NumberPickerView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp5(NumberPickerView numberPickerView, Looper looper) {
        super(looper);
        this.b = numberPickerView;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int iJ;
        int i;
        switch (this.a) {
            case 0:
                int i2 = message.what;
                NumberPickerView numberPickerView = this.b;
                if (i2 == 1) {
                    int i3 = 0;
                    if (!((OverScroller) numberPickerView.U.b).isFinished()) {
                        if (numberPickerView.H0 == 0) {
                            numberPickerView.p(1);
                        }
                        numberPickerView.D0.sendMessageDelayed(NumberPickerView.g(message.obj, 1, 0, 0), 32L);
                    } else {
                        if (numberPickerView.U0 != 0) {
                            if (numberPickerView.H0 == 0) {
                                numberPickerView.p(1);
                            }
                            int i4 = numberPickerView.U0;
                            int i5 = numberPickerView.P0;
                            if (i4 < (-i5) / 2) {
                                int i6 = i5 + i4;
                                i = (int) ((i6 * 300.0f) / i5);
                                ((OverScroller) numberPickerView.U.b).startScroll(0, numberPickerView.V0, 0, i6, i * 3);
                                iJ = numberPickerView.j(numberPickerView.V0 + numberPickerView.P0 + numberPickerView.U0);
                            } else {
                                i = (int) (((-i4) * 300.0f) / i5);
                                ((OverScroller) numberPickerView.U.b).startScroll(0, numberPickerView.V0, 0, i4, i * 3);
                                iJ = numberPickerView.j(numberPickerView.V0 + numberPickerView.U0);
                            }
                            i3 = i;
                            numberPickerView.postInvalidate();
                        } else {
                            numberPickerView.p(0);
                            iJ = numberPickerView.j(numberPickerView.V0);
                        }
                        Message messageG = NumberPickerView.g(message.obj, 2, numberPickerView.B, iJ);
                        if (!numberPickerView.T) {
                            numberPickerView.D0.sendMessageDelayed(messageG, i3 * 2);
                        } else {
                            numberPickerView.E0.sendMessageDelayed(messageG, i3 * 2);
                        }
                    }
                    break;
                } else if (i2 == 2) {
                    NumberPickerView.a(numberPickerView, message.arg1, message.arg2, message.obj);
                    break;
                }
                break;
            default:
                super.handleMessage(message);
                int i7 = message.what;
                NumberPickerView numberPickerView2 = this.b;
                if (i7 == 2) {
                    NumberPickerView.a(numberPickerView2, message.arg1, message.arg2, message.obj);
                    break;
                } else if (i7 == 3) {
                    numberPickerView2.requestLayout();
                    break;
                }
                break;
        }
    }

    public zp5(NumberPickerView numberPickerView) {
        this.b = numberPickerView;
    }
}
