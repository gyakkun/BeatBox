package moe.nyamori.beatbox;

public class Sound {

    private String mAssetPath;
    private String mName;
    private Integer mSoundId;
    // mSoundId as Integer rather than int, in case when a certain
    // Sound instance has no mSoundId value then it can be set null

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }


    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }
}
