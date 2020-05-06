package demo_base.pattern.factoryPattern;

public class Sha512CEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String plaintext) {
        return "512"+plaintext;
    }
}
