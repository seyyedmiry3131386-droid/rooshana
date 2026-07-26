package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s17 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static final float a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static ui6 b(AppCompatTextView appCompatTextView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new ui6(ul.v(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(ul.l(jr9.m(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new ui6(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static long c(h26 h26Var, int i, int i2) {
        h26Var.J(i);
        if (h26Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iJ = h26Var.j();
        if ((8388608 & iJ) != 0 || ((2096896 & iJ) >> 8) != i2 || (iJ & 32) == 0 || h26Var.x() < 7 || h26Var.a() < 7 || (h26Var.x() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        h26Var.h(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static final dd7 d(qz0 qz0Var) {
        cd7 cd7VarI = w07.i(qz0Var);
        boolean zF = qz0Var.f(cd7VarI);
        Object objM = qz0Var.M();
        if (zF || objM == jz0.a) {
            objM = new dd7(new a67(3, cd7VarI), new a(-1320822745, new va(8, cd7VarI), true));
            qz0Var.l0(objM);
        }
        return (dd7) objM;
    }

    public static void e(k81 k81Var) {
        k81Var.k = -3.4028235E38f;
        k81Var.j = Integer.MIN_VALUE;
        CharSequence charSequence = k81Var.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                k81Var.a = SpannableString.valueOf(charSequence);
                k81Var.b = null;
            }
            CharSequence charSequence2 = k81Var.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float f(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static void g(TextView textView, int i) {
        wu8.k(i);
        if (Build.VERSION.SDK_INT >= 28) {
            ul.D(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void h(TextView textView, int i) {
        wu8.k(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void i(TextView textView, int i) {
        wu8.k(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ActionMode.Callback j(ActionMode.Callback callback) {
        return (!(callback instanceof lj8) || Build.VERSION.SDK_INT < 26) ? callback : ((lj8) callback).a;
    }

    public static final sy6 k(v04 v04Var) {
        sy6 sy6VarN = c26.n(v04Var, true);
        long jU = v04Var.u(sy6VarN.d());
        float f = sy6VarN.c;
        float f2 = sy6VarN.d;
        long jU2 = v04Var.u((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new sy6(Float.intBitsToFloat((int) (jU >> 32)), Float.intBitsToFloat((int) (jU & 4294967295L)), Float.intBitsToFloat((int) (jU2 >> 32)), Float.intBitsToFloat((int) (jU2 & 4294967295L)));
    }

    public static ActionMode.Callback l(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof lj8) || callback == null) ? callback : new lj8(callback, textView);
    }

    public static void m(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(rm7.o(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
            }
        }
    }
}
