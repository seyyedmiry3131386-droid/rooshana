package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import defpackage.eu6;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public boolean d;
    public boolean e;
    public String f;
    public final Rect g;
    public int h;
    public int i;
    public int j;
    public int k;

    public MockView(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.g = new Rect();
        this.h = Color.argb(255, 0, 0, 0);
        this.i = Color.argb(255, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        this.j = Color.argb(255, 50, 50, 50);
        this.k = 4;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.MockView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.MockView_mock_label) {
                    this.f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == eu6.MockView_mock_showDiagonals) {
                    this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                } else if (index == eu6.MockView_mock_diagonalsColor) {
                    this.h = typedArrayObtainStyledAttributes.getColor(index, this.h);
                } else if (index == eu6.MockView_mock_labelBackgroundColor) {
                    this.j = typedArrayObtainStyledAttributes.getColor(index, this.j);
                } else if (index == eu6.MockView_mock_labelColor) {
                    this.i = typedArrayObtainStyledAttributes.getColor(index, this.i);
                } else if (index == eu6.MockView_mock_showLabel) {
                    this.e = typedArrayObtainStyledAttributes.getBoolean(index, this.e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f == null) {
            try {
                this.f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        int i2 = this.h;
        Paint paint = this.a;
        paint.setColor(i2);
        paint.setAntiAlias(true);
        int i3 = this.i;
        Paint paint2 = this.b;
        paint2.setColor(i3);
        paint2.setAntiAlias(true);
        this.c.setColor(this.j);
        this.k = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * this.k);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.d) {
            width--;
            height--;
            float f = width;
            float f2 = height;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, 0.0f, f, f2, this.a);
            canvas2.drawLine(0.0f, f2, f, 0.0f, this.a);
            canvas2.drawLine(0.0f, 0.0f, f, 0.0f, this.a);
            canvas2.drawLine(f, 0.0f, f, f2, this.a);
            canvas2.drawLine(f, f2, 0.0f, f2, this.a);
            canvas2.drawLine(0.0f, f2, 0.0f, 0.0f, this.a);
        } else {
            canvas2 = canvas;
        }
        String str = this.f;
        if (str == null || !this.e) {
            return;
        }
        int length = str.length();
        Paint paint = this.b;
        Rect rect = this.g;
        paint.getTextBounds(str, 0, length, rect);
        float fWidth = (width - rect.width()) / 2.0f;
        float fHeight = ((height - rect.height()) / 2.0f) + rect.height();
        rect.offset((int) fWidth, (int) fHeight);
        int i = rect.left;
        int i2 = this.k;
        rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
        canvas2.drawRect(rect, this.c);
        canvas2.drawText(this.f, fWidth, fHeight, paint);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.g = new Rect();
        this.h = Color.argb(255, 0, 0, 0);
        this.i = Color.argb(255, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        this.j = Color.argb(255, 50, 50, 50);
        this.k = 4;
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.d = true;
        this.e = true;
        this.f = null;
        this.g = new Rect();
        this.h = Color.argb(255, 0, 0, 0);
        this.i = Color.argb(255, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        this.j = Color.argb(255, 50, 50, 50);
        this.k = 4;
        a(context, attributeSet);
    }
}
