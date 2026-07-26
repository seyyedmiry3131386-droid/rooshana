package com.microsoft.clarity.models.display.common;

/* JADX INFO: loaded from: classes3.dex */
public final class SkiaPictureHeader {
    private final long pictureVersion;

    public SkiaPictureHeader(long j) {
        this.pictureVersion = j;
    }

    public static /* synthetic */ SkiaPictureHeader copy$default(SkiaPictureHeader skiaPictureHeader, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = skiaPictureHeader.pictureVersion;
        }
        return skiaPictureHeader.copy(j);
    }

    public final long component1() {
        return this.pictureVersion;
    }

    public final SkiaPictureHeader copy(long j) {
        return new SkiaPictureHeader(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkiaPictureHeader) && this.pictureVersion == ((SkiaPictureHeader) obj).pictureVersion;
    }

    public final long getPictureVersion() {
        return this.pictureVersion;
    }

    public int hashCode() {
        long j = this.pictureVersion;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "SkiaPictureHeader(pictureVersion=" + this.pictureVersion + ')';
    }
}
