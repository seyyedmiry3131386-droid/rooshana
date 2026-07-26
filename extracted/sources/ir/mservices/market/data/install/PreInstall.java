package ir.mservices.market.data.install;

/* JADX INFO: loaded from: classes3.dex */
public enum PreInstall {
    Default("DefaultInstaller"),
    Package("PackageInstaller");

    private String text;

    PreInstall(String str) {
        this.text = str;
    }

    public static PreInstall fromString(String str) {
        for (PreInstall preInstall : values()) {
            if (preInstall.text.equalsIgnoreCase(str)) {
                return preInstall;
            }
        }
        return Default;
    }

    public String getText() {
        return this.text;
    }
}
