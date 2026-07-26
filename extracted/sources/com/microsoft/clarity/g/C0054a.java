package com.microsoft.clarity.g;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.microsoft.clarity.g.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0054a extends Canvas {
    public static final /* synthetic */ int e = 0;
    public final Picture a;
    public final E b;
    public Long c;
    public final ArrayList d = new ArrayList();

    public C0054a(Picture picture, E e2) {
        this.a = picture;
        this.b = e2;
    }

    public final Bitmap a(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        if (config != config2) {
            return bitmap;
        }
        E e2 = this.b;
        e2.getClass();
        if (bitmap.getConfig() == config2) {
            int iHashCode = bitmap.hashCode();
            synchronized (e2.c) {
                B b = (B) e2.b.get(Integer.valueOf(iHashCode));
                if (b != null) {
                    b.c = System.currentTimeMillis();
                    bitmap = b.a;
                } else {
                    b0.a(e2.a, new C(bitmap, e2, iHashCode), null, 6);
                    bitmap = null;
                }
            }
        }
        if (bitmap != null) {
            return bitmap;
        }
        Long l = this.c;
        if (l != null) {
            this.d.add(Long.valueOf(l.longValue()));
        }
        return null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        js3.p(rectF, "oval");
        js3.p(paint, "paint");
        try {
            super.drawArc(rectF, f, f2, z, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawArc(rectF, f, f2, z, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        js3.p(bitmap, "bitmap");
        js3.p(matrix, "matrix");
        Bitmap bitmapA = a(bitmap);
        if (bitmapA != null) {
            try {
                super.drawBitmap(bitmapA, matrix, paint);
            } catch (Exception unused) {
                super.drawBitmap(bitmapA, matrix, a(paint));
            }
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        js3.p(bitmap, "bitmap");
        js3.p(fArr, "verts");
        Bitmap bitmapA = a(bitmap);
        if (bitmapA != null) {
            try {
                super.drawBitmapMesh(bitmapA, i, i2, fArr, i3, iArr, i4, paint);
            } catch (Exception unused) {
                super.drawBitmapMesh(bitmapA, i, i2, fArr, i3, iArr, i4, a(paint));
            }
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        js3.p(paint, "paint");
        try {
            super.drawCircle(f, f2, f3, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawCircle(f, f2, f3, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        js3.p(rectF, "outer");
        js3.p(fArr, "outerRadii");
        js3.p(rectF2, "inner");
        js3.p(fArr2, "innerRadii");
        js3.p(paint, "paint");
        try {
            super.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        js3.p(iArr, "glyphIds");
        js3.p(fArr, "positions");
        js3.p(font, "font");
        js3.p(paint, "paint");
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        try {
            super.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawGlyphs(iArr, i, fArr, i2, i3, font, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        js3.p(paint, "paint");
        try {
            super.drawLine(f, f2, f3, f4, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawLine(f, f2, f3, f4, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        js3.p(fArr, "pts");
        js3.p(paint, "paint");
        try {
            super.drawLines(fArr, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawLines(fArr, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        js3.p(mesh, "mesh");
        js3.p(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        js3.p(rectF, "oval");
        js3.p(paint, "paint");
        try {
            super.drawOval(rectF, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawOval(rectF, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        js3.p(paint, "paint");
        try {
            super.drawPaint(paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawPaint(paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        js3.p(ninePatch, "patch");
        js3.p(rect, "dst");
        if (Build.VERSION.SDK_INT >= 31 && ninePatch.getBitmap().getConfig() != Bitmap.Config.HARDWARE) {
            try {
                super.drawPatch(ninePatch, rect, paint);
            } catch (Exception unused) {
                Paint paintA = a(paint);
                js3.m(paintA);
                super.drawPatch(ninePatch, rect, paintA);
            }
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        js3.p(path, "path");
        js3.p(paint, "paint");
        try {
            super.drawPath(path, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawPath(path, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        js3.p(picture, "picture");
        if (picture.equals(this.a)) {
            return;
        }
        super.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        js3.p(paint, "paint");
        try {
            super.drawPoint(f, f2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawPoint(f, f2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        js3.p(fArr, "pts");
        js3.p(paint, "paint");
        try {
            super.drawPoints(fArr, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawPoints(fArr, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        js3.p(cArr, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(fArr, "pos");
        js3.p(paint, "paint");
        try {
            super.drawPosText(cArr, i, i2, fArr, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawPosText(cArr, i, i2, fArr, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        js3.p(rect, "r");
        js3.p(paint, "paint");
        try {
            super.drawRect(rect, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawRect(rect, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        js3.p(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        js3.p(rectF, "rect");
        js3.p(paint, "paint");
        try {
            super.drawRoundRect(rectF, f, f2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawRoundRect(rectF, f, f2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        try {
            super.drawText(str, f, f2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawText(str, f, f2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(path, "path");
        js3.p(paint, "paint");
        try {
            super.drawTextOnPath(str, path, f, f2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawTextOnPath(str, path, f, f2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        js3.p(charSequence, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        try {
            super.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        js3.p(vertexMode, "mode");
        js3.p(fArr, "verts");
        js3.p(paint, "paint");
        try {
            super.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        js3.p(paint, "paint");
        try {
            super.drawArc(f, f2, f3, f4, f5, f6, z, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawArc(f, f2, f3, f4, f5, f6, z, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        js3.p(fArr, "pts");
        js3.p(paint, "paint");
        try {
            super.drawLines(fArr, i, i2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawLines(fArr, i, i2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        js3.p(paint, "paint");
        try {
            super.drawOval(f, f2, f3, f4, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawOval(f, f2, f3, f4, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        js3.p(paint, "paint");
        try {
            super.drawPoints(fArr, i, i2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawPoints(fArr, i, i2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(fArr, "pos");
        js3.p(paint, "paint");
        try {
            super.drawPosText(str, fArr, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawPosText(str, fArr, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        js3.p(rectF, "rect");
        js3.p(paint, "paint");
        try {
            super.drawRect(rectF, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawRect(rectF, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        js3.p(paint, "paint");
        try {
            super.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawRoundRect(f, f2, f3, f4, f5, f6, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        js3.p(cArr, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        try {
            super.drawText(cArr, i, i2, f, f2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawText(cArr, i, i2, f, f2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        js3.p(cArr, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(path, "path");
        js3.p(paint, "paint");
        try {
            super.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawTextOnPath(cArr, i, i2, path, f, f2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        js3.p(bitmap, "bitmap");
        Bitmap bitmapA = a(bitmap);
        if (bitmapA != null) {
            try {
                super.drawBitmap(bitmapA, f, f2, paint);
            } catch (Exception unused) {
                super.drawBitmap(bitmapA, f, f2, a(paint));
            }
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        js3.p(rectF, "outer");
        js3.p(rectF2, "inner");
        js3.p(paint, "paint");
        try {
            super.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        js3.p(picture, "picture");
        js3.p(rect, "dst");
        if (picture.equals(this.a)) {
            return;
        }
        super.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        js3.p(cArr, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        try {
            super.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        js3.p(ninePatch, "patch");
        js3.p(rectF, "dst");
        if (Build.VERSION.SDK_INT >= 31 && ninePatch.getBitmap().getConfig() != Bitmap.Config.HARDWARE) {
            try {
                super.drawPatch(ninePatch, rectF, paint);
            } catch (Exception unused) {
                Paint paintA = a(paint);
                js3.m(paintA);
                super.drawPatch(ninePatch, rectF, paintA);
            }
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        js3.p(paint, "paint");
        try {
            super.drawRect(f, f2, f3, f4, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawRect(f, f2, f3, f4, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        try {
            super.drawText(str, i, i2, f, f2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawText(str, i, i2, f, f2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        js3.p(bitmap, "bitmap");
        js3.p(rect2, "dst");
        Bitmap bitmapA = a(bitmap);
        if (bitmapA != null) {
            try {
                super.drawBitmap(bitmapA, rect, rect2, paint);
            } catch (Exception unused) {
                super.drawBitmap(bitmapA, rect, rect2, a(paint));
            }
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        js3.p(picture, "picture");
        js3.p(rectF, "dst");
        if (picture.equals(this.a)) {
            return;
        }
        super.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        js3.p(charSequence, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        try {
            super.drawText(charSequence, i, i2, f, f2, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawText(charSequence, i, i2, f, f2, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        js3.p(measuredText, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        try {
            super.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
        } catch (Exception unused) {
            Paint paintA = a(paint);
            js3.m(paintA);
            super.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paintA);
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        js3.p(bitmap, "bitmap");
        js3.p(rectF, "dst");
        Bitmap bitmapA = a(bitmap);
        if (bitmapA != null) {
            try {
                super.drawBitmap(bitmapA, rect, rectF, paint);
            } catch (Exception unused) {
                super.drawBitmap(bitmapA, rect, rectF, a(paint));
            }
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        js3.p(iArr, "colors");
        try {
            super.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
        } catch (Exception unused) {
            super.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, a(paint));
        }
    }

    public static Paint a(Paint paint) {
        if ((paint != null ? paint.getShader() : null) == null) {
            return paint;
        }
        Paint paint2 = new Paint();
        paint2.set(paint);
        paint2.setShader(null);
        return paint2;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        js3.p(iArr, "colors");
        try {
            super.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
        } catch (Exception unused) {
            super.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, a(paint));
        }
    }
}
