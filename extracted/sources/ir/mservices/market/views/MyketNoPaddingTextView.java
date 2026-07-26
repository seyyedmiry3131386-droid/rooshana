package ir.mservices.market.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketNoPaddingTextView extends MyketTextView {
    public int l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketNoPaddingTextView(Context context) {
        this(context, null);
        js3.p(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        js3.p(canvas, "canvas");
        canvas.translate(0.0f, (-this.l) / 6.0f);
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = new TextView(getContext());
        textView.setTextSize(0, getTextSize());
        textView.setLines(1);
        textView.measure(0, 0);
        float measuredHeight = textView.getMeasuredHeight() - getTextSize();
        if (measuredHeight > 0.0f) {
            this.l = (int) measuredHeight;
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            String string = getText().toString();
            Context context = getContext();
            js3.o(context, "getContext(...)");
            MyketTextView myketTextView = new MyketTextView(context, null);
            myketTextView.setTextSize(0, getTextSize());
            myketTextView.setText(string);
            myketTextView.measure(i, 0);
            i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + (myketTextView.getMeasuredHeight() - this.l), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketNoPaddingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        js3.p(context, "context");
        setIncludeFontPadding(false);
    }
}
