DROP TABLE IF EXISTS herb;

CREATE TABLE herb (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL UNIQUE,
    subname VARCHAR(255),
    image TEXT,
    history TEXT,
    pros TEXT,
    cons TEXT,
    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP NOT NULL
);




INSERT INTO herb (name, subname, image, history, pros, cons)
VALUES
('Neem', 'Azadirachta indica', 'https://i.postimg.cc/MKN5whYt/neem.jpg',
 'Neem is native to the Indian subcontinent and has been used in Ayurvedic medicine for over 2,000 years.',
 'Antibacterial, antifungal, natural pesticide, treats skin conditions.',
 'Bitter taste, not safe in high doses for children or pregnant women.'),

('Tulsi', 'Ocimum sanctum', 'https://i.postimg.cc/Jz8qtj9B/tulsi.jpg',
 'Known as Holy Basil, Tulsi is considered a sacred plant in Hinduism and used in Ayurveda for respiratory and immunity support.',
 'Boosts immunity, relieves stress, anti-inflammatory.',
 'Strong aroma; may lower blood sugar excessively in diabetics.'),

('Ashwagandha', 'Withania somnifera', 'https://cdn.herbs.com/images/ashwagandha.jpg',
 'Ashwagandha is a key herb in Ayurvedic medicine, known for its adaptogenic properties.',
 'Reduces stress, improves strength, boosts testosterone.',
 'May cause drowsiness, stomach upset in high doses.'),

('Brahmi', 'Bacopa monnieri', 'https://cdn.herbs.com/images/brahmi.jpg',
 'Used in Ayurvedic medicine to enhance memory and brain function.',
 'Improves memory, reduces anxiety, antioxidant.',
 'Mild nausea or digestive discomfort possible.'),

('Amla', 'Phyllanthus emblica', 'https://cdn.herbs.com/images/amla.jpg',
 'Also called Indian gooseberry, Amla is rich in vitamin C and widely used in Ayurveda.',
 'Boosts immunity, promotes hair growth, improves digestion.',
 'May lower blood sugar; caution with hypoglycemia.'),

('Shatavari', 'Asparagus racemosus', 'https://cdn.herbs.com/images/shatavari.jpg',
 'Used to support female reproductive health in Ayurveda.',
 'Balances hormones, improves fertility, supports lactation.',
 'May cause allergic reaction in people with asparagus allergy.'),

('Giloy', 'Tinospora cordifolia', 'https://cdn.herbs.com/images/giloy.jpg',
 'Giloy is known as "Amrita" in Ayurveda and used for boosting immunity.',
 'Detoxifies body, fights fever, boosts immunity.',
 'Excessive use may lead to constipation or autoimmune stimulation.'),

('Mulethi', 'Glycyrrhiza glabra', 'https://cdn.herbs.com/images/mulethi.jpg',
 'Also known as Licorice root, used for respiratory and digestive issues.',
 'Soothes throat, aids digestion, anti-ulcer.',
 'High doses may raise blood pressure or cause water retention.'),

('Arjuna', 'Terminalia arjuna', 'https://cdn.herbs.com/images/arjuna.jpg',
 'Used traditionally to support heart health.',
 'Improves cardiac function, antioxidant, reduces blood pressure.',
 'Can interfere with other heart medications.'),

('Guggul', 'Commiphora mukul', 'https://cdn.herbs.com/images/guggul.jpg',
 'Resin used in Ayurveda for weight and cholesterol management.',
 'Reduces cholesterol, anti-inflammatory, detoxifying.',
 'Can cause skin rash or stomach upset.'),

('Manjistha', 'Rubia cordifolia', 'https://cdn.herbs.com/images/manjistha.jpg',
 'Used for blood purification and skin health.',
 'Purifies blood, treats acne and eczema, detoxifying.',
 'May cause diarrhea if consumed in large amounts.'),

('Turmeric', 'Curcuma longa', 'https://cdn.herbs.com/images/turmeric.jpg',
 'Staple in Indian cuisine and medicine, known for curcumin.',
 'Anti-inflammatory, antioxidant, improves joint health.',
 'May cause stomach upset in sensitive individuals.'),

('Cinnamon', 'Cinnamomum verum', 'https://cdn.herbs.com/images/cinnamon.jpg',
 'Common spice with medicinal properties.',
 'Lowers blood sugar, antimicrobial, improves circulation.',
 'Large doses may cause liver damage due to coumarin content.'),

('Fenugreek', 'Trigonella foenum-graecum', 'https://cdn.herbs.com/images/fenugreek.jpg',
 'Used for blood sugar control and lactation support.',
 'Lowers blood sugar, increases breast milk, improves digestion.',
 'May cause body odor or gas.'),

('Kalmegh', 'Andrographis paniculata', 'https://cdn.herbs.com/images/kalmegh.jpg',
 'Traditionally used for liver health and immunity.',
 'Liver tonic, immune booster, antipyretic.',
 'Bitter taste, can cause headaches in excess.'),

('Chitrak', 'Plumbago zeylanica', 'https://cdn.herbs.com/images/chitrak.jpg',
 'Used for digestive and metabolic health in Ayurveda.',
 'Stimulates digestion, treats obesity, boosts metabolism.',
 'May cause irritation or ulcers if overused.'),

('Bael', 'Aegle marmelos', 'https://cdn.herbs.com/images/bael.jpg',
 'Bael fruit is used in Ayurveda for diarrhea and digestion.',
 'Relieves constipation, treats IBS, anti-bacterial.',
 'Overripe fruit can be hard to digest.'),

('Haritaki', 'Terminalia chebula', 'https://cdn.herbs.com/images/haritaki.jpg',
 'One of the three fruits in Triphala, used for detox and longevity.',
 'Improves digestion, promotes longevity, detoxifier.',
 'May cause dehydration or diarrhea if overused.'),

('Bibhitaki', 'Terminalia bellirica', 'https://cdn.herbs.com/images/bibhitaki.jpg',
 'Second fruit in Triphala, used for respiratory and digestive disorders.',
 'Supports lung health, reduces fat, detoxifies.',
 'Can be drying to the body if taken alone.'),

('Triphala', 'Triphala (Blend)', 'https://cdn.herbs.com/images/triphala.jpg',
 'A mix of Haritaki, Bibhitaki, and Amla — a key Ayurvedic formula.',
 'Detoxifies colon, improves digestion, boosts immunity.',
 'May be too strong for very weak or underweight individuals.');
