package demo_base.pattern.factoryPattern;

public class Sha512Encryptor extends Encryptor {
    @Override
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return new Sha512CEncryptionAlgorithm();
    }
}









