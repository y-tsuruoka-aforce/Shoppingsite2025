# 2025年新人研修用リポジトリ

# main から単元用のブランチを作成
git checkout main
git checkout -b feature/unit03-functions

# コーディング → コミット
git add .
git commit -m "Add unit 03 functions"

# main にマージ（ブランチは残す）
git checkout main
git merge feature/unit03-functions

# push してGitHubに反映
git push origin main
git push origin feature/unit03-functions

## ブランチ運用ルール

- 単元ごとにブランチを作成してください（例: `unit02-variables`）
- 開発が終わったら `main` ブランチにマージしますが、**ブランチは削除しないでください**
- ブランチの作成元は必ず `main` にしてください
- GitHubにpushする際は、mainとブランチの両方をpushしてください
