package demo_base.pattern.factoryPattern;

public class Sha256CEncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String plaintext) {
        return "256"+plaintext;
    }
}
