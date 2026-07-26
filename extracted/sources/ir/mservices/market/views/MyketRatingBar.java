package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.br9;
import defpackage.cd;
import defpackage.dp2;
import defpackage.i25;
import defpackage.js3;
import defpackage.pq6;
import defpackage.sj8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketRatingBar extends LinearLayout {
    public static final int e = pq6.rating_star_big;
    public static final int f = pq6.rating_star_medium;
    public static final int g = pq6.rating_star_normal;
    public static final int h = pq6.rating_star_small;
    public final ArrayList a;
    public int b;
    public dp2 c;
    public float d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketRatingBar(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public final float getRating() {
        return this.d;
    }

    public final dp2 getUpdateRatingListener() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setRating(float r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r0.next()
            int r3 = r1 + 1
            r4 = 0
            if (r1 < 0) goto L96
            ir.mservices.market.views.MyketStar r2 = (ir.mservices.market.views.MyketStar) r2
            android.content.res.Resources r5 = r13.getResources()
            java.lang.String r6 = "getResources(...)"
            defpackage.js3.o(r5, r6)
            float r6 = (float) r1
            r7 = 1
            float r7 = (float) r7
            float r8 = r14 - r7
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 1061997773(0x3f4ccccd, float:0.8)
            if (r6 <= 0) goto L54
            int r9 = (int) r14
            if (r1 != r9) goto L37
            float r10 = r14 % r7
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 < 0) goto L37
            goto L54
        L37:
            if (r1 != r9) goto L51
            float r9 = r14 % r7
            double r9 = (double) r9
            r11 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 > 0) goto L51
            r11 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto L51
            int r9 = defpackage.yq6.ic_star_half
            goto L56
        L51:
            int r9 = defpackage.yq6.ic_star_empty
            goto L56
        L54:
            int r9 = defpackage.yq6.ic_star_fill
        L56:
            q39 r10 = defpackage.q39.a(r5, r9, r4)     // Catch: java.lang.Exception -> L6c
            if (r10 == 0) goto L5d
            goto L74
        L5d:
            java.lang.ThreadLocal r10 = defpackage.b77.a     // Catch: java.lang.Exception -> L6c
            android.graphics.drawable.Drawable r10 = r5.getDrawable(r9, r4)     // Catch: java.lang.Exception -> L6c
            if (r10 == 0) goto L66
            goto L74
        L66:
            android.content.res.Resources$NotFoundException r10 = new android.content.res.Resources$NotFoundException     // Catch: java.lang.Exception -> L6c
            r10.<init>()     // Catch: java.lang.Exception -> L6c
            throw r10     // Catch: java.lang.Exception -> L6c
        L6c:
            java.lang.ThreadLocal r10 = defpackage.b77.a
            android.graphics.drawable.Drawable r10 = r5.getDrawable(r9, r4)
            if (r10 == 0) goto L90
        L74:
            r2.setStarImage(r10)
            int r4 = r13.b
            if (r6 <= 0) goto L84
            int r5 = (int) r14
            if (r1 != r5) goto L8a
            float r1 = r14 % r7
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 < 0) goto L8a
        L84:
            ir.mservices.market.theme.ThemeData r1 = defpackage.sj8.b()
            int r4 = r1.l
        L8a:
            r2.setNumberTextColor(r4)
            r1 = r3
            goto L7
        L90:
            android.content.res.Resources$NotFoundException r14 = new android.content.res.Resources$NotFoundException
            r14.<init>()
            throw r14
        L96:
            defpackage.br9.P()
            throw r4
        L9a:
            r13.d = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.views.MyketRatingBar.setRating(float):void");
    }

    public final void setStarStyle(int i, int i2, boolean z, int i3) {
        int i4 = 0;
        for (Object obj : this.a) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                br9.P();
                throw null;
            }
            MyketStar myketStar = (MyketStar) obj;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(myketStar.getContext().getResources().getDimensionPixelSize(i2), myketStar.getContext().getResources().getDimensionPixelSize(i2));
            layoutParams.setMargins(i3, 0, i3, 0);
            myketStar.setLayoutParams(layoutParams);
            this.b = i;
            myketStar.setStarColor(i);
            myketStar.setNumberText(i5, i2 == e);
            boolean z2 = !z;
            myketStar.setClickable(z2);
            myketStar.setEnabled(z2);
            i4 = i5;
        }
    }

    public final void setUpdateRatingListener(dp2 dp2Var) {
        js3.p(dp2Var, "<set-?>");
        this.c = dp2Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        this.a = new ArrayList();
        this.b = sj8.b().c;
        this.c = new i25(12);
        int i2 = 0;
        setOrientation(0);
        setLayoutDirection(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int i3 = 1;
        while (true) {
            int i4 = 6;
            if (i3 >= 6) {
                return;
            }
            Context context2 = getContext();
            js3.o(context2, "getContext(...)");
            MyketStar myketStar = new MyketStar(context2, null, i4, i2);
            myketStar.setOnClickListener(new cd(15, this));
            this.a.add(myketStar);
            addView(myketStar);
            i3++;
        }
    }

    public /* synthetic */ MyketRatingBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
