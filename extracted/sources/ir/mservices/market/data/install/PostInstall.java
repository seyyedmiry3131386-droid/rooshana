package ir.mservices.market.data.install;

/* JADX INFO: loaded from: classes3.dex */
public enum PostInstall {
    Default("Default"),
    ShowDialog("ShowDialog"),
    OpenDirectly("OpenDirectly"),
    OpenIntent("OpenIntent"),
    Nothing("Nothing");

    private String text;

    PostInstall(String str) {
        this.text = str;
    }

    public static PostInstall fromString(String str) {
        for (PostInstall postInstall : values()) {
            if (postInstall.text.equalsIgnoreCase(str)) {
                return postInstall;
            }
        }
        return Default;
    }

    public String getText() {
        return this.text;
    }
}
