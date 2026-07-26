package ir.mservices.market.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import defpackage.av;
import defpackage.bl4;
import defpackage.bp2;
import defpackage.bu6;
import defpackage.c24;
import defpackage.e28;
import defpackage.f28;
import defpackage.h28;
import defpackage.hh2;
import defpackage.i1;
import defpackage.iy;
import defpackage.js3;
import defpackage.k;
import defpackage.kh2;
import defpackage.nc2;
import defpackage.of5;
import defpackage.ol3;
import defpackage.pf5;
import defpackage.pi4;
import defpackage.pj9;
import defpackage.qf5;
import defpackage.rb4;
import defpackage.rs6;
import defpackage.ry7;
import defpackage.sf5;
import defpackage.ti4;
import defpackage.tq1;
import defpackage.vp7;
import defpackage.wt5;
import defpackage.xg5;
import defpackage.xn3;
import defpackage.yq1;
import ir.mservices.market.version2.core.utils.SafeURLSpan;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.views.MyketTextView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public class MyketTextView extends MaterialTextView {
    public static final /* synthetic */ int k = 0;
    public sf5 h;
    public final c24 i;
    public boolean j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketTextView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    private final pi4 getMarkwon() {
        return (pi4) this.i.getValue();
    }

    public static /* synthetic */ void setExpandableHtmlText$default(MyketTextView myketTextView, String str, int i, Integer num, boolean z, int i2, bp2 bp2Var, wt5 wt5Var, boolean z2, boolean z3, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setExpandableHtmlText");
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        if ((i3 & 16) != 0) {
            i2 = 2;
        }
        if ((i3 & 32) != 0) {
            bp2Var = null;
        }
        if ((i3 & 64) != 0) {
            wt5Var = null;
        }
        if ((i3 & 128) != 0) {
            z2 = false;
        }
        if ((i3 & 256) != 0) {
            z3 = false;
        }
        myketTextView.setExpandableHtmlText(str, i, num, z, i2, bp2Var, wt5Var, z2, z3);
    }

    public static /* synthetic */ void setExpandableMarkdownText$default(MyketTextView myketTextView, String str, Integer num, int i, boolean z, boolean z2, bp2 bp2Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setExpandableMarkdownText");
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            bp2Var = null;
        }
        myketTextView.setExpandableMarkdownText(str, num, i, z, z2, bp2Var);
    }

    public static /* synthetic */ void setExpandableText$default(MyketTextView myketTextView, String str, Integer num, int i, boolean z, boolean z2, bp2 bp2Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setExpandableText");
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            bp2Var = null;
        }
        myketTextView.setExpandableText(str, num, i, z, z2, bp2Var);
    }

    public static /* synthetic */ void setTextFromHtml$default(MyketTextView myketTextView, String str, int i, TextView.BufferType bufferType, wt5 wt5Var, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTextFromHtml");
        }
        if ((i2 & 4) != 0) {
            bufferType = TextView.BufferType.SPANNABLE;
        }
        TextView.BufferType bufferType2 = bufferType;
        if ((i2 & 8) != 0) {
            wt5Var = null;
        }
        wt5 wt5Var2 = wt5Var;
        if ((i2 & 16) != 0) {
            z = false;
        }
        myketTextView.setTextFromHtml(str, i, bufferType2, wt5Var2, z);
    }

    public final boolean getBold() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Runnable, sf5] */
    public final void h(boolean z, final int i, final Integer num, boolean z2, final bp2 bp2Var, final bp2 bp2Var2, final bp2 bp2Var3, final boolean z3) {
        sf5 sf5Var = this.h;
        if (sf5Var != null) {
            removeCallbacks(sf5Var);
        }
        this.h = null;
        setMaxLines(i);
        if (z) {
            setText("");
            return;
        }
        if (z2) {
            setMaxLines(Integer.MAX_VALUE);
            bp2Var2.invoke();
            return;
        }
        bp2Var2.invoke();
        final String string = getContext().getString(rs6.more);
        js3.o(string, "getString(...)");
        ?? r0 = new Runnable() { // from class: sf5
            @Override // java.lang.Runnable
            public final void run() {
                Object objA;
                MyketTextView myketTextView = this.a;
                String str = string;
                bp2 bp2Var4 = bp2Var3;
                bp2 bp2Var5 = bp2Var2;
                bp2 bp2Var6 = bp2Var;
                Integer num2 = num;
                int i2 = MyketTextView.k;
                try {
                    Layout layout = myketTextView.getLayout();
                    if (layout == null) {
                        return;
                    }
                    int lineCount = layout.getLineCount();
                    int i3 = i;
                    if (lineCount <= i3) {
                        return;
                    }
                    int lineEnd = layout.getLineEnd(i3 - 1) - (str.length() + 6);
                    int i4 = 0;
                    if (lineEnd < 0) {
                        lineEnd = 0;
                    }
                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(((CharSequence) bp2Var4.invoke()).subSequence(0, lineEnd)).append((CharSequence) "... ").append((CharSequence) str);
                    spannableStringBuilderAppend.setSpan(new uf5(myketTextView, myketTextView, bp2Var5, bp2Var6, num2), spannableStringBuilderAppend.length() - str.length(), spannableStringBuilderAppend.length(), 33);
                    myketTextView.setHighlightColor(0);
                    myketTextView.setText(spannableStringBuilderAppend);
                    if (z3) {
                        myketTextView.setOnClickListener(new tf5(myketTextView, bp2Var5, bp2Var6, i4));
                        myketTextView.setOnTouchListener(null);
                    } else {
                        myketTextView.setOnTouchListener(new jx1(3, myketTextView));
                    }
                    objA = tx8.a;
                } catch (Throwable th) {
                    objA = b.a(th);
                }
                if (Result.a(objA) != null) {
                    bp2Var5.invoke();
                }
                myketTextView.h = null;
            }
        };
        this.h = r0;
        post(r0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        sf5 sf5Var = this.h;
        if (sf5Var != null) {
            removeCallbacks(sf5Var);
        }
        this.h = null;
        super.onDetachedFromWindow();
    }

    public final void setBold(boolean z) {
        this.j = z;
        setTypeface((Typeface) (z ? kh2.b.b : kh2.b.a).b);
    }

    public final void setExpandableHtmlText(final String str, int i, Integer num, boolean z, final int i2, bp2 bp2Var, final wt5 wt5Var, final boolean z2, boolean z3) {
        h(str == null || str.length() == 0, i, num, z, bp2Var, new bp2() { // from class: rf5
            @Override // defpackage.bp2
            public final Object invoke() {
                int i3 = MyketTextView.k;
                this.a.setTextFromHtml(str, i2, TextView.BufferType.SPANNABLE, wt5Var, z2);
                return tx8.a;
            }
        }, new qf5(this, 1), z3);
    }

    public final void setExpandableMarkdownText(String str, Integer num, int i, boolean z, boolean z2, bp2 bp2Var) {
        h(str == null || str.length() == 0, i, num, z, bp2Var, new of5(1, this, str), new qf5(this, 0), z2);
    }

    public final void setExpandableText(String str, Integer num, int i, boolean z, boolean z2, bp2 bp2Var) {
        h(str == null || str.length() == 0, i, num, z2, bp2Var, new of5(0, this, str), new pf5(str, 0), z);
    }

    public final void setMarkdownText(String str) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        ti4 ti4Var = (ti4) getMarkwon();
        List list = ti4Var.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).getClass();
        }
        vp7 vp7Var = ti4Var.a;
        yq1 yq1Var = new yq1((ArrayList) vp7Var.b, (ol3) vp7Var.d, (ArrayList) vp7Var.c);
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                break;
            }
            yq1Var.i(str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            yq1Var.i(str.substring(i));
        }
        yq1Var.f(yq1Var.n);
        nc2 nc2Var = new nc2(10, yq1Var.k, yq1Var.m, false);
        yq1Var.j.getClass();
        xn3 xn3Var = new xn3(nc2Var);
        Iterator it2 = yq1Var.o.iterator();
        while (it2.hasNext()) {
            ((k) it2.next()).f(xn3Var);
        }
        tq1 tq1Var = (tq1) yq1Var.l.b;
        Iterator it3 = ((ArrayList) vp7Var.e).iterator();
        if (it3.hasNext()) {
            throw bl4.o(it3);
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            ((i1) it4.next()).getClass();
        }
        hh2 hh2Var = ti4Var.b;
        vp7 vp7Var2 = new vp7((rb4) hh2Var.c, new xg5(8), new h28(), DesugarCollections.unmodifiableMap((HashMap) ((pj9) hh2Var.b).a), new av(3));
        vp7Var2.B0(tq1Var);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            ((i1) it5.next()).a(vp7Var2);
        }
        h28 h28Var = (h28) vp7Var2.d;
        SpannableStringBuilder f28Var = new f28(h28Var.a);
        for (e28 e28Var : h28Var.b) {
            f28Var.setSpan(e28Var.a, e28Var.b, e28Var.c, e28Var.d);
        }
        if (TextUtils.isEmpty(f28Var) && !TextUtils.isEmpty(str)) {
            f28Var = new SpannableStringBuilder(str);
        }
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            ((i1) it6.next()).c(this, f28Var);
        }
        setText(f28Var, TextView.BufferType.SPANNABLE);
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            ((i1) it7.next()).b(this);
        }
    }

    public final void setTextFromHtml(String str, int i) {
        setTextFromHtml$default(this, str, i, null, null, false, 28, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        this.i = kotlin.a.a(new iy(context, 3));
        int[] iArr = bu6.MyketTextView;
        js3.o(iArr, "MyketTextView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        setBold(typedArrayObtainStyledAttributes.getBoolean(bu6.MyketTextView_bold, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setTextFromHtml(String str, int i, TextView.BufferType bufferType) {
        js3.p(bufferType, "type");
        setTextFromHtml$default(this, str, i, bufferType, null, false, 24, null);
    }

    public final void setTextFromHtml(String str, int i, TextView.BufferType bufferType, wt5 wt5Var) {
        js3.p(bufferType, "type");
        setTextFromHtml$default(this, str, i, bufferType, wt5Var, false, 16, null);
    }

    public final void setTextFromHtml(String str, int i, TextView.BufferType bufferType, wt5 wt5Var, boolean z) {
        js3.p(bufferType, "type");
        if (i != 2) {
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        Pattern pattern = SafeURLSpan.d;
        setText(new SpannableString(ry7.q(str, wt5Var, z, i)), bufferType);
    }
}
